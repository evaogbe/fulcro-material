(ns ogbe.fulcro.mui.icons.grid-view-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GridViewOutlined" :default GridViewOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-view-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridViewOutlined)))