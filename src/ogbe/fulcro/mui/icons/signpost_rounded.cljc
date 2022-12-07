(ns ogbe.fulcro.mui.icons.signpost-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SignpostRounded" :default SignpostRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signpost-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignpostRounded)))