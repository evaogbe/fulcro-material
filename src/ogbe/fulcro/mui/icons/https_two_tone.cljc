(ns ogbe.fulcro.mui.icons.https-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/HttpsTwoTone" :default HttpsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-https-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpsTwoTone)))