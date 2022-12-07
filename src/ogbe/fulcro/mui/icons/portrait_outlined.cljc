(ns ogbe.fulcro.mui.icons.portrait-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PortraitOutlined" :default PortraitOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-portrait-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PortraitOutlined)))