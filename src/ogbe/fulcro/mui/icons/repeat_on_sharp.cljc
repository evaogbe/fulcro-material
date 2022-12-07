(ns ogbe.fulcro.mui.icons.repeat-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RepeatOnSharp" :default RepeatOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatOnSharp)))