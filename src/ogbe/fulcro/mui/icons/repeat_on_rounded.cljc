(ns ogbe.fulcro.mui.icons.repeat-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RepeatOnRounded" :default RepeatOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatOnRounded)))