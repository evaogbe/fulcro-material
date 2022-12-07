(ns ogbe.fulcro.mui.icons.view-column
  #?(:cljs (:require
            ["@mui/icons-material/ViewColumn" :default ViewColumn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-column
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewColumn)))