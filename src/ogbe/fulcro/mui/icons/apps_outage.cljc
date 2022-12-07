(ns ogbe.fulcro.mui.icons.apps-outage
  #?(:cljs (:require
            ["@mui/icons-material/AppsOutage" :default AppsOutage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps-outage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AppsOutage)))