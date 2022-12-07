(ns ogbe.fulcro.mui.icons.link-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/LinkTwoTone" :default LinkTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-link-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LinkTwoTone)))