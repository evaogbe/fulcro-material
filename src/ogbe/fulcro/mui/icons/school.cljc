(ns ogbe.fulcro.mui.icons.school
  #?(:cljs (:require
            ["@mui/icons-material/School" :default School]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-school
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory School)))