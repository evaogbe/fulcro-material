(ns ogbe.fulcro.mui.icons.input-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/InputTwoTone" :default InputTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-input-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InputTwoTone)))