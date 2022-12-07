(ns ogbe.fulcro.mui.icons.lock-person-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LockPersonRounded" :default LockPersonRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-person-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockPersonRounded)))