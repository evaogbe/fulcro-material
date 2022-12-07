(ns ogbe.fulcro.mui.icons.people-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PeopleRounded" :default PeopleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleRounded)))