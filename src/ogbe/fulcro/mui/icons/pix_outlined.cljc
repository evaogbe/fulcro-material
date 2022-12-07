(ns ogbe.fulcro.mui.icons.pix-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PixOutlined" :default PixOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pix-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PixOutlined)))