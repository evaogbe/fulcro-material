(ns ogbe.fulcro.mui.icons.access-time
  #?(:cljs (:require
            ["@mui/icons-material/AccessTime" :default AccessTime]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-access-time
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessTime)))