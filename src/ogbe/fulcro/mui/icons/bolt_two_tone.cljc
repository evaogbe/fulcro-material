(ns ogbe.fulcro.mui.icons.bolt-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BoltTwoTone" :default BoltTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bolt-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoltTwoTone)))