(ns ogbe.fulcro.mui.icons.people-outline
  #?(:cljs (:require
            ["@mui/icons-material/PeopleOutline" :default PeopleOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleOutline)))