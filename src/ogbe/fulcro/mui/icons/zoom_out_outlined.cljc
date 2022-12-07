(ns ogbe.fulcro.mui.icons.zoom-out-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ZoomOutOutlined" :default ZoomOutOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-zoom-out-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ZoomOutOutlined)))