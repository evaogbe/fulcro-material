(ns ogbe.fulcro.mui.icons.tsunami-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TsunamiSharp" :default TsunamiSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tsunami-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TsunamiSharp)))