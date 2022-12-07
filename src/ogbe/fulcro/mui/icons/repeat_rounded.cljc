(ns ogbe.fulcro.mui.icons.repeat-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RepeatRounded" :default RepeatRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatRounded)))