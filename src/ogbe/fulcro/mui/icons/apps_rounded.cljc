(ns ogbe.fulcro.mui.icons.apps-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AppsRounded" :default AppsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppsRounded)))