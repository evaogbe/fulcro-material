(ns ogbe.fulcro.mui.icons.view-week
  #?(:cljs (:require
            ["@mui/icons-material/ViewWeek" :default ViewWeek]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-week
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewWeek)))