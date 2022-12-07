(ns ogbe.fulcro.mui.icons.dangerous-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DangerousSharp" :default DangerousSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dangerous-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DangerousSharp)))