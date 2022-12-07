(ns ogbe.fulcro.mui.icons.view-list-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ViewListRounded" :default ViewListRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-list-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewListRounded)))