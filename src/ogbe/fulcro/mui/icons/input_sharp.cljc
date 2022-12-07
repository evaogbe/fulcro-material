(ns ogbe.fulcro.mui.icons.input-sharp
  #?(:cljs (:require
            ["@mui/icons-material/InputSharp" :default InputSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-input-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InputSharp)))