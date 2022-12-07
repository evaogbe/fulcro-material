(ns ogbe.fulcro.mui.icons.privacy-tip
  #?(:cljs (:require
            ["@mui/icons-material/PrivacyTip" :default PrivacyTip]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-privacy-tip
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrivacyTip)))