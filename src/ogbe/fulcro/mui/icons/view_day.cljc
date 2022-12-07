(ns ogbe.fulcro.mui.icons.view-day
  #?(:cljs (:require
            ["@mui/icons-material/ViewDay" :default ViewDay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-day
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewDay)))