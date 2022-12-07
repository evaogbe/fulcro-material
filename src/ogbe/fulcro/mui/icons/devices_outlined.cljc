(ns ogbe.fulcro.mui.icons.devices-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DevicesOutlined" :default DevicesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-devices-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DevicesOutlined)))