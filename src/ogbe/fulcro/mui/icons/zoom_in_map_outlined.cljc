(ns ogbe.fulcro.mui.icons.zoom-in-map-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ZoomInMapOutlined" :default ZoomInMapOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-in-map-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomInMapOutlined)))