(ns ogbe.fulcro.mui.icons.not-started
  #?(:cljs (:require
            ["@mui/icons-material/NotStarted" :default NotStarted]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-not-started
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotStarted)))