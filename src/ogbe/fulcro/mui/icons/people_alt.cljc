(ns ogbe.fulcro.mui.icons.people-alt
  #?(:cljs (:require
            ["@mui/icons-material/PeopleAlt" :default PeopleAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleAlt)))