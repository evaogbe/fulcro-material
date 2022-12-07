(ns ogbe.fulcro.mui.icons.people-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PeopleSharp" :default PeopleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PeopleSharp)))