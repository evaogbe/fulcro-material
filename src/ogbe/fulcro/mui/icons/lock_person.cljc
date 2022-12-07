(ns ogbe.fulcro.mui.icons.lock-person
  #?(:cljs (:require
            ["@mui/icons-material/LockPerson" :default LockPerson]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-person
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockPerson)))