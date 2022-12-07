(ns ogbe.fulcro.mui.icons.radio-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RadioSharp" :default RadioSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioSharp)))