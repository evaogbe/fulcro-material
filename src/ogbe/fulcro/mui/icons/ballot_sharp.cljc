(ns ogbe.fulcro.mui.icons.ballot-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BallotSharp" :default BallotSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ballot-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BallotSharp)))