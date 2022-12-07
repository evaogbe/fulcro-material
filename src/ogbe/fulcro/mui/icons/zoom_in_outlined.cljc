(ns ogbe.fulcro.mui.icons.zoom-in-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInOutlined" :default ZoomInOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInOutlined)))