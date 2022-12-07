(ns ogbe.fulcro.mui.icons.people
  #?(:cljs (:require
            ["@mui/icons-material/People" :default People]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-people
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory People)))