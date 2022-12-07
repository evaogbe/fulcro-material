(ns ogbe.fulcro.mui.icons.maximize-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MaximizeSharp" :default MaximizeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maximize-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaximizeSharp)))