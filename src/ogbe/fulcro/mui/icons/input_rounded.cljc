(ns ogbe.fulcro.mui.icons.input-rounded
  #?(:cljs (:require
            ["@mui/icons-material/InputRounded" :default InputRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-input-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InputRounded)))