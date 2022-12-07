(ns ogbe.fulcro.mui.icons.coronavirus-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CoronavirusSharp" :default CoronavirusSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-coronavirus-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CoronavirusSharp)))