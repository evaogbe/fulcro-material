(ns ogbe.fulcro.mui.icons.signpost-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SignpostSharp" :default SignpostSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signpost-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignpostSharp)))