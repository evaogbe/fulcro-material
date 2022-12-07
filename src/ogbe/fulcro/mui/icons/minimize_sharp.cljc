(ns ogbe.fulcro.mui.icons.minimize-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MinimizeSharp" :default MinimizeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minimize-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MinimizeSharp)))