(ns ogbe.fulcro.mui.icons.repeat-on
  #?(:cljs (:require
            ["@mui/icons-material/RepeatOn" :default RepeatOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatOn)))