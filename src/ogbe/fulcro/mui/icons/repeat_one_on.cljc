(ns ogbe.fulcro.mui.icons.repeat-one-on
  #?(:cljs (:require
            ["@mui/icons-material/RepeatOneOn" :default RepeatOneOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-one-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatOneOn)))