(ns ogbe.fulcro.mui.icons.view-column-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ViewColumnOutlined" :default ViewColumnOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-column-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewColumnOutlined)))