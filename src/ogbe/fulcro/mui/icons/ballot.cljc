(ns ogbe.fulcro.mui.icons.ballot
  #?(:cljs (:require
            ["@mui/icons-material/Ballot" :default Ballot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ballot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Ballot)))