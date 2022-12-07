(ns ogbe.fulcro.mui.icons.repeat-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RepeatSharp" :default RepeatSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RepeatSharp)))