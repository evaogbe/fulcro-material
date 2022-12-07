(ns ogbe.fulcro.mui.icons.repeat-one
  #?(:cljs (:require
            ["@mui/icons-material/RepeatOne" :default RepeatOne]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-one
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatOne)))