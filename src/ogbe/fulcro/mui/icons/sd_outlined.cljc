(ns ogbe.fulcro.mui.icons.sd-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SdOutlined" :default SdOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdOutlined)))