(ns ogbe.fulcro.mui.icons.person
  #?(:cljs (:require
            ["@mui/icons-material/Person" :default Person]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Person)))