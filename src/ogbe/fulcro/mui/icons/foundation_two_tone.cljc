(ns ogbe.fulcro.mui.icons.foundation-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FoundationTwoTone" :default FoundationTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-foundation-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FoundationTwoTone)))