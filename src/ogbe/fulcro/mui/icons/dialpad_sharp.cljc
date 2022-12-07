(ns ogbe.fulcro.mui.icons.dialpad-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DialpadSharp" :default DialpadSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dialpad-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DialpadSharp)))