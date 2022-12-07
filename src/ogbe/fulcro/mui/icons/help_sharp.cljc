(ns ogbe.fulcro.mui.icons.help-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HelpSharp" :default HelpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HelpSharp)))