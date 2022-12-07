(ns ogbe.fulcro.mui.icons.textsms-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TextsmsSharp" :default TextsmsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-textsms-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TextsmsSharp)))