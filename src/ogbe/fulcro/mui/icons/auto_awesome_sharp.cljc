(ns ogbe.fulcro.mui.icons.auto-awesome-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AutoAwesomeSharp" :default AutoAwesomeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-awesome-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoAwesomeSharp)))